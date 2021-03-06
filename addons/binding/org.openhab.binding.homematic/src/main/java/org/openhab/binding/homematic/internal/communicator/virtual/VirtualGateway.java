/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.homematic.internal.communicator.virtual;

import java.io.IOException;

import org.openhab.binding.homematic.internal.communicator.HomematicGateway;
import org.openhab.binding.homematic.internal.communicator.HomematicGatewayListener;
import org.openhab.binding.homematic.internal.communicator.client.RpcClient;
import org.openhab.binding.homematic.internal.misc.HomematicClientException;
import org.openhab.binding.homematic.internal.model.HmDatapoint;
import org.openhab.binding.homematic.internal.model.HmDatapointConfig;

/**
 * Extends the HomematicGateway with a method called from a virtual datapoint.
 *
 * @author Gerhard Riegler - Initial contribution
 */
public interface VirtualGateway extends HomematicGateway {

    /**
     * Sends the datapoint from a virtual datapoint.
     */
    public void sendDatapointIgnoreVirtual(HmDatapoint dp, HmDatapointConfig dpConfig, Object newValue)
            throws IOException, HomematicClientException;

    /**
     * Returns the rpc client.
     */
    public RpcClient getRpcClient();

    /**
     * Disables a boolean datapoint by setting the value to false after a given delay.
     */
    public void disableDatapoint(HmDatapoint dp, double delay);

    /**
     * Returns the event listener.
     */
    public HomematicGatewayListener getEventListener();
}
