package samepackage;

import external.External;

public class Pr24 {
    public static void main(String[] args) {
        External externalMember = new External();
        System.out.println(externalMember.getName());

        Internal internalMember = new Internal();
        System.out.println(internalMember.getName());
    }
}
