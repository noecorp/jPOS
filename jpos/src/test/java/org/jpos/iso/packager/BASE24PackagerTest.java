/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2014 Alejandro P. Revilla
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jpos.iso.packager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class BASE24PackagerTest {

    @Test
    public void testConstructor() throws Throwable {
        BASE24Packager bASE24Packager = new BASE24Packager();
        assertNull("bASE24Packager.getLogger()", bASE24Packager.getLogger());
        assertEquals("bASE24Packager.fld.length", 129, bASE24Packager.fld.length);
        assertNull("bASE24Packager.getRealm()", bASE24Packager.getRealm());
    }
}
