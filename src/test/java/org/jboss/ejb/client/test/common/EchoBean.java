/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2017 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.ejb.client.test.common;

import org.jboss.ejb.client.annotation.ClientTransaction;
import org.jboss.ejb.client.annotation.ClientTransactionPolicy;
import org.jboss.logging.Logger;

/**
 * User: jpai
 */
public class EchoBean implements Echo {

    private static final Logger logger = Logger.getLogger(EchoBean.class);
    private final String whoami;

    public EchoBean() {
        this("noidea");
    }

    public EchoBean(String whoami) {
        this.whoami = whoami;
    }

    @Override
    public String echo(String msg) {
        logger.info(this.getClass().getSimpleName() + " echoing message " + msg);
        return msg;
    }

    public String whoAreYou() {
        return whoami;
    }

    public String whoAreYouNonTX() {
        return whoAreYou();
    }
}
