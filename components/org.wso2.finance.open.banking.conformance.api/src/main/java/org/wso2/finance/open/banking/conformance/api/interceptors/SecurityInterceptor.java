/*
 *
 *  * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *  *
 *  * WSO2 Inc. licenses this file to you under the Apache License,
 *  * Version 2.0 (the "License"); you may not use this file except
 *  * in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing,
 *  * software distributed under the License is distributed on an
 *  * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  * KIND, either express or implied.  See the License for the
 *  * specific language governing permissions and limitations
 *  * under the License.
 *
 */

package org.wso2.finance.open.banking.conformance.api.interceptors;

import org.wso2.finance.open.banking.conformance.api.interceptors.abstractions.AbstractBasicAuthSecurityInterceptor;

/**
 * Interceptor to authenticate user.
 */
public class SecurityInterceptor extends AbstractBasicAuthSecurityInterceptor {

    /**
     * validates the username and password of the user.
     *
     * @param userName username
     * @param password password
     * @return true if authentication is successful or false otherwise
     */
    @Override
    protected boolean authenticate(String userName, String password) {

        if (userName.equals("admin") && password.equals("admin")) {
            return true;
        }
        return false;
    }
}
