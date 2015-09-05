/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.model;

import java.io.IOException;
import java.io.Writer;

import org.thymeleaf.engine.ElementDefinition;
import org.thymeleaf.engine.ITemplateEvent;

/**
 *
 * @author Daniel Fern&aacute;ndez
 * @since 3.0.0
 * 
 */
public interface IElementTag extends ITemplateEvent {

    public ElementDefinition getElementDefinition();
    public String getElementName();

    public boolean isSynthetic();

    public void write(final Writer writer) throws IOException;

    public IElementTag cloneElementTag();

}
