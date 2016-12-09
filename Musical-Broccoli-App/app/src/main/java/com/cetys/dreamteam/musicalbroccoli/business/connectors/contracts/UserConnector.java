package com.cetys.dreamteam.musicalbroccoli.business.connectors.contracts;

import com.cetys.dreamteam.musicalbroccoli.core.models.User;

/**
 * @Author J. Pichardo on 12/7/2016.
 */

public interface UserConnector extends BaseConnector<User> {

    void login(User user);
}
