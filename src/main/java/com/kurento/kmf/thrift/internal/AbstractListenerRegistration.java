/*
 * (C) Copyright 2013 Kurento (http://kurento.org/)
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 */
package com.kurento.kmf.thrift.internal;

import com.kurento.kmf.thrift.ListenerRegistration;

public abstract class AbstractListenerRegistration implements
		ListenerRegistration {

	private final String callbackToken;

	public AbstractListenerRegistration(String callbackToken) {
		this.callbackToken = callbackToken;
	}

	@Override
	public String getRegistrationId() {
		return callbackToken;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}

		AbstractListenerRegistration other = (AbstractListenerRegistration) obj;
		return callbackToken.equals(other.callbackToken);
	}

	@Override
	public int hashCode() {
		return callbackToken.hashCode();
	}

}
