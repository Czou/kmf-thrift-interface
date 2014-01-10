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
package com.kurento.kmf.thrift;

/**
 * Interface to be implemented by {@link MediaEvent} listeners. Implementors of
 * this interface will be on charge of processing the events raised by media
 * elements.
 * 
 * @param <T>
 *            A class that extends from a {@link MediaEvent}
 * 
 * @author Luis López (llopez@gsyc.es)
 * @author Ivan Gracia (igracia@gsyc.es)
 * @since 2.0.0
 */
public interface MediaEventListener<T extends MediaEvent> {

	/**
	 * Method invoked by the framework when an event is raised in the media
	 * server.
	 * 
	 * @param event
	 *            The event
	 */
	void onEvent(T event);
}
