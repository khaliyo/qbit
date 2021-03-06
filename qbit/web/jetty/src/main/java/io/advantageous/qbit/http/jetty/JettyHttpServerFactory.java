/*
 * Copyright (c) 2015. Rick Hightower, Geoff Chandler
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * QBit - The Microservice lib for Java : JSON, WebSocket, REST. Be The Web!
 */

package io.advantageous.qbit.http.jetty;

import io.advantageous.qbit.http.config.HttpServerOptions;
import io.advantageous.qbit.http.jetty.impl.server.JettyQBitHttpServer;
import io.advantageous.qbit.http.server.HttpServer;
import io.advantageous.qbit.queue.QueueBuilder;
import io.advantageous.qbit.spi.HttpServerFactory;
import io.advantageous.qbit.system.QBitSystemManager;

/**
 * @author rhightower on 2/13/15.
 */
public class JettyHttpServerFactory implements HttpServerFactory {

    @Override
    public HttpServer create(HttpServerOptions options, QueueBuilder requestQueueBuilder,
                             QueueBuilder responseQueueBuilder,
                             QueueBuilder webSocketMessageQueueBuilder, QBitSystemManager systemManager) {
        return new JettyQBitHttpServer(options, systemManager);
    }
}
