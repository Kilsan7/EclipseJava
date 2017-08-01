package org.apache.http.examples.client;
/*
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.omg.CORBA.NameValuePair;

public class QuickStart {

    public static void main(String[] args) throws Exception {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpGet httpGet = new HttpGet("http://httpbin.org/get");
            CloseableHttpResponse response1 = httpclient.execute(httpGet);

/**
 *           The underlying HTTP connection is still held by the response object to allow the response content to be streamed directly from the network socket. to allow the response content to be streamed directly from the network socket.
 *           In order to ensure correct deallocation of system resources the user MUST call CloseableHttpResponse#close() from a finally clause.
 *           Please note that if response content is not fully consumed the underlying connection cannot be safely re-used and will be shut down and discarded by the connection manager.
 * 			 기본 HTTP 연결은 응답 객체가 네트워크 소켓에서 직접 스트리밍 할 수 있도록 응답 객체가 계속 보유합니다.
 * 			 시스템 자원의 정확한 할당 해제를 보장하기 위해 사용자는 finally 절에서 CloseableHttpResponse # close ()를 호출해야합니다.
 * 			 응답 내용을 완전히 사용하지 않으면 기본 연결을 안전하게 다시 사용할 수 없으므로 연결 관리자가 종료하고 폐기합니다.           
 */
            try {
                System.out.println("response1.getStatusLine() 출력" + response1.getStatusLine());
                HttpEntity entity1 = response1.getEntity();
                System.out.println("entity1.getContent() 값은 : " + entity1.getContent());
                // do something useful with the response body
                // and ensure it is fully consumed
                EntityUtils.consume(entity1);
            } finally {
                response1.close();
            }

            HttpPost httpPost = new HttpPost("http://httpbin.org/post");
            List <NameValuePair> nvps = new ArrayList <NameValuePair>();
            nvps.add(new BasicNameValuePair("username", "vip"));
            nvps.add(new BasicNameValuePair("password", "secret"));
            httpPost.setEntity(new UrlEncodedFormEntity(nvps));
            CloseableHttpResponse response2 = httpclient.execute(httpPost);

            try {
                System.out.println("response2.getStatusLine() 출력" + response2.getStatusLine());
                HttpEntity entity2 = response2.getEntity();
                System.out.println("entity2.getContent() 값은 : "+ entity2.getContent());
                System.out.println("entity2.hashCode() 값은 : "+ entity2.hashCode());
                System.out.println("entity2.hashCode() Hex 값은 : "+ Integer.toHexString(entity2.hashCode()));
                
                // do something useful with the response body
                // and ensure it is fully consumed
                EntityUtils.consume(entity2);
            } finally {
                System.out.println("response2.close() 실행");
                response2.close();
            }
        } finally {
            System.out.println("httpclient.close() 실행");
            httpclient.close();
        }
    }

}
