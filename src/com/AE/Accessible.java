package com.AE;

/**
 * Created by Angel on 1/13/17.
 */

// Challenge:
// In the following interface declaration, what is the visibility of:
//
// 1. the Accessible interface?
// 2. the int variable SOME_CONSTANT?
// 3. methodA?
// 4. methodB and methodC?
//
// Hint: think back to the lecture on interfaces before answering.

//package-private only visable to all the classes inside the same package
interface Accessible {
    int SOME_CONSTANT = 100;// not allowed
    public  void methodA();//visible everywhere
    void methodB();//public only visable to all the classes inside the same package
    boolean methodC();//public only visable to all the classes inside the same package

}
