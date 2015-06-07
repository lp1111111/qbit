package io.advantageous.qbit.service.health;


import io.advantageous.qbit.client.ClientProxy;
import io.advantageous.qbit.reactive.Callback;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public interface HealthServiceAsync extends ClientProxy {


    default void register(String name, long time, TimeUnit timeUnit){}


    default void checkInOk(String name) {}

    default void checkIn(String name, HealthStatus status) {}


    default void ok(Callback<Boolean> ok) {}

    default void findHealthyNodes(Callback<List<String>> callback){}

    default void findAllNodes(Callback<List<String>> callback){}

    default void findAllNodesWithStatus(Callback<List<String>> callback, HealthStatus queryStatus){}


    default void findNotHealthyNodes(Callback<List<String>> callback){}


    default List<NodeHealthStat> loadNodes(){
        return Collections.emptyList();
    }

    default void unregister(String serviceName){}
}
