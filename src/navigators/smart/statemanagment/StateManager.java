/**
 * Copyright (c) 2007-2009 Alysson Bessani, Eduardo Alchieri, Paulo Sousa, and the authors indicated in the @author tags
 * 
 * This file is part of SMaRt.
 * 
 * SMaRt is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * SMaRt is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the 
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with SMaRt.  If not, see <http://www.gnu.org/licenses/>.
 */

package navigators.smart.statemanagment;

import navigators.smart.tom.ServiceReplica;

/**
 * TODO: Não sei se esta classe sera usada. Para já, deixo ficar
 * 
 * @author Jo�o Sousa
 */
public class StateManager {

    public static final int K = 1000;

    private ServiceReplica replica;
    private StateLog log;

    public StateManager(ServiceReplica replica) {

        this.replica = replica;
        this.log = new StateLog(K);
    }

    public void makeCheckpoint() {
        
    }

    public void teste() {
        // So para ver se isto funciona
    }
}
