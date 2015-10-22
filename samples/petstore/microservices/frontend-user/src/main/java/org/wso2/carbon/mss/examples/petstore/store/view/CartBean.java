/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *   WSO2 Inc. licenses this file to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.wso2.carbon.mss.examples.petstore.store.view;

import org.wso2.carbon.mss.examples.petstore.store.model.Cart;
import org.wso2.carbon.mss.examples.petstore.util.model.Pet;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

@ManagedBean
@ViewScoped
public class CartBean implements Serializable {

    @ManagedProperty("#{cart}")
    private Cart cart;

    private Pet selected;

    public void addToCart(Pet pet){
       cart.addItem(pet);
    }
    public void removeFromCart(Pet pet){
        cart.removeItem(pet);
    }
    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Pet getSelected() {
        return selected;
    }

    public void setSelected(Pet selected) {
        this.selected = selected;
    }
}