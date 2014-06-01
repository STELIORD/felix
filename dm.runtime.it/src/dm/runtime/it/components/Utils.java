/*
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
 */
package dm.runtime.it.components;

public class Utils {
    public static final String DM_BSN = "org.apache.felix.dm"; // FIXME replace by org.apache.felix.dependencymanager
    public static final String DM_RUNTIME_IT_COMPONENTS_BSN = "dm.runtime.it.components"; // FIXME replace by proper package

    public static void schedule(final Runnable task, final long n) {
        Thread t = new Thread() {
            public void run() {
                try {
                    sleep(n);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                task.run();
            }
        };
        t.start();
    }
}
