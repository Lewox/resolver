/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.shrinkwrap.resolver.api.maven.embedded;

/**
 * @author <a href="mailto:mjobanek@gmail.com">Matous Jobanek</a>
 */
public interface BuildStage {

    /**
     * Build project using previously configured project data and environment settings.
     *
     * @return An instance of @{BuiltProject} as a representation of the built project
     */
    BuiltProject build();

    /**
     * If a failure of a project maven build should be ignored. Default is <code>false</code>
     *
     * @param ignoreFailure If a failure of a project maven build should be ignored
     * @return Modified EmbeddedMaven instance
     */
    BuildStage ignoreFailure(boolean ignoreFailure);

    /**
     * Sets that a failure of a project maven build should be ignored.
     *
     * @return Modified EmbeddedMaven instance
     */
    BuildStage ignoreFailure();

}
