package com.example.lab1;

public class fly implements Activity
{
    public void move(Plase now,Plase future)
    {
        if (now.comparePlase(future))
        {
            System.out.println("You're already here!");
        }
        else
        {
            System.out.println("You have moved to a new place !");
            now.setPlase(future);
        }
    }
}
