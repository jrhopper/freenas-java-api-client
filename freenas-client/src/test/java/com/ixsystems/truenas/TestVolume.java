/**
 * Copyright (C) 2018 iXsystems
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * * Neither the name of py-bsd nor the names of its
 *   contributors may be used to endorse or promote products derived from
 *   this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.ixsystems.truenas;

import com.ixsystems.vcp.entities.Volume;
import com.ixsystems.vcp.entities.network.GlobalConfigurations;
import org.freenas.client.connectors.rest.imp.AuthenticationConnector;
import org.freenas.client.connectors.rest.imp.EndpointConnector;
import org.freenas.client.network.GlobalConfigurationConnector;
import org.freenas.client.network.rest.impl.GlobalConfigurationRestConnector;
import org.freenas.client.storage.rest.impl.VolumeRestConnector;
import org.junit.Test;

import java.util.List;

public class TestVolume {

    @Test
    public void tryFetchList() {
        AuthenticationConnector auth = AuxiliarAuth.getAuth();
        EndpointConnector ep = new EndpointConnector("http://10.20.20.176/", "http");
        VolumeRestConnector gs = new VolumeRestConnector(ep, auth);
        List<Volume> volumeList = gs.list();
        for (Volume volume : volumeList){
            System.out.println(volume);
        }
    }

    @Test
    public void createVolume() {

        AuthenticationConnector auth = AuxiliarAuth.getAuth();
        EndpointConnector ep = new EndpointConnector("http://10.20.20.176/", "http");
        VolumeRestConnector gs = new VolumeRestConnector(ep, auth);
        List<Volume> volumeList = gs.list();
        for (Volume volume : volumeList){
            System.out.println(volume);
        }
    }

    @Test
    public void deleteVolume() {

    }

    @Test
    public void update() {

    }

}



