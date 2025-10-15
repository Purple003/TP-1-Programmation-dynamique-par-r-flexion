/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extention;

import dao.IDao;

/**
 *
 * @author T490
 */

public class DaoImplV2 implements IDao{

   @Override
    public double getValue() {
        System.out.println("NEW");
        double data =33;  
        return data;
    }
}
