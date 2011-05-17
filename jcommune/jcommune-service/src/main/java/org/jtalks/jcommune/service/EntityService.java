/**
 * Copyright (C) 2011  jtalks.org Team
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 * Also add information on how to contact you by electronic and paper mail.
 * Creation date: Apr 12, 2011 / 8:05:19 PM
 * The jtalks.org Project
 */
package org.jtalks.jcommune.service;

import org.jtalks.jcommune.model.entity.Persistent;

import java.util.List;

/**
 * This is generic interface for services which would interact with database entities via DAO object.
 * This interface include all base method declaration which straightly based on database CRUD operations.         
 * 
 * @author Osadchuck Eugeny
 */
public interface EntityService<T extends Persistent> {

    /**
     * Delete row in database table corresponded to current primary id.
     * @param id - primary id of database table row to delete
     */
    void delete(Long id);

    /**
     * Get persistent object by id. Method is trying to find persistent object with current primary id and return it. 
     * @param id - primary id of persistent object to find.
     * @return - persistent object T or null if row with primary id = id is absent.
     */
    T get(Long id);

    /**
     * Get list of all persistence objects T currently present in database.
     * @return - list of persistence objects T.
     */
    List<T> getAll();
}
