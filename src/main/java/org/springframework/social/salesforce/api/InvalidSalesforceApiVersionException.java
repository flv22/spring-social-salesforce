/**
 * Copyright (C) 2017 https://github.com/jottley/spring-social-salesforce
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.salesforce.api;

/**
 * 
 * @author Jared Ottley
 *
 */
public class InvalidSalesforceApiVersionException 
        extends Throwable
{
    public InvalidSalesforceApiVersionException()
    {
        //NOOP
    }
    
    public InvalidSalesforceApiVersionException(String version)
    {
        super(version + " is not a valid Salesforce Api version.");
    }
}
