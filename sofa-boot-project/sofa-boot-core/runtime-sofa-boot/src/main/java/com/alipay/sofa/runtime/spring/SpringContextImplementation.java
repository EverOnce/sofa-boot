/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.runtime.spring;

import com.alipay.sofa.runtime.api.ServiceValidationException;
import com.alipay.sofa.runtime.spi.component.Implementation;
import org.springframework.context.ApplicationContext;

/**
 * @author khotyn
 * Created on 2020/10/26
 */
public class SpringContextImplementation implements Implementation {
    private ApplicationContext applicationContext;

    public SpringContextImplementation(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public String getName() {
        return applicationContext.getDisplayName();
    }

    @Override
    public Object getTarget() {
        return applicationContext;
    }

    @Override
    public Class<?> getTargetClass() {
        return applicationContext.getClass();
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public boolean isLazyInit() {
        return false;
    }

    @Override
    public void setTarget(Object target) {
        applicationContext = (ApplicationContext) target;
    }

    @Override
    public boolean isFactory() {
        return false;
    }

    @Override
    public void validate() throws ServiceValidationException {

    }
}