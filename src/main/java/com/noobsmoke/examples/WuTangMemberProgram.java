package com.noobsmoke.examples;

import java.util.Scanner;

public class WuTangMemberProgram {

    private String[] members;
    private int memberSize;
    private Scanner input;
    public String album = "36 Chambers";

    private boolean isFull() {
        return memberSize >= members.length;
    }

    private boolean isEmpty() {
        return members == null || members.length == 0 || memberSize == 0;
    }

    public WuTangMemberProgram() {
        this.members = new String[2];
        this.memberSize = 0;
        this.input = new Scanner(System.in);
    }


    private void resize() {
        String[] newMembers = new String[memberSize + 1];
        for (int index = 0; index < memberSize; index++)
            newMembers[index] = members[index];
        members = newMembers;
    }

    private void addNewMember(String newMember) {
        if (isFull()) resize();
        members[++memberSize] = newMember;
        System.out.println(newMember + " Was Added To Group");
    }

    private void searchMember(String memberName) {
        if (isEmpty()) System.out.println("Member List Is Currently Empty!");
        for (int i = 0; i < memberSize; i++) {
            if (members[i].equalsIgnoreCase(memberName)) {
                System.out.println(memberName + " Is A Member");
                return;
            }
        }
        System.out.println(memberName + " Could Not Be Found!");
    }




}