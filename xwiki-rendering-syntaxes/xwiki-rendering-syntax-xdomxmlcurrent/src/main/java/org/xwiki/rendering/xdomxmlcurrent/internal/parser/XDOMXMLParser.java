/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.rendering.xdomxmlcurrent.internal.parser;

import org.xwiki.component.annotation.Component;
import org.xwiki.rendering.internal.parser.xml.AbstractParser;
import org.xwiki.rendering.syntax.Syntax;

/**
 * XDOM+XML stream based parser.
 * 
 * @version $Id$
 */
@Component("xdom+xml/current")
public class XDOMXMLParser extends AbstractParser
{
    @Override
    public Syntax getSyntax()
    {
        return Syntax.XDOMXML_CURRENT;
    }
}
