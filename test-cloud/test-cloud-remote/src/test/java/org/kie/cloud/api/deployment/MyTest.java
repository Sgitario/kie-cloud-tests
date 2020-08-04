/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.cloud.api.deployment;

import cz.xtf.core.openshift.OpenShifts;
import org.junit.Test;
import org.kie.cloud.openshift.util.CommandUtil;

import static org.junit.Assert.assertEquals;

public class MyTest {
    @Test
    public void test() {
        CommandExecutionResult pod = CommandUtil.runCommandImpl(OpenShifts.admin("josecarvajalhilario-local-fe38").pods().withName("myapp-rhpamcentr-1-mhp8n"), "echo", "hello");
        assertEquals(pod.getOutput(), "hello\n");
    }
}
