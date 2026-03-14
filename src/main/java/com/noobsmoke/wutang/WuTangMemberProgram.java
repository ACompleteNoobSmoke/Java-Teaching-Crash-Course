//package com.noobsmoke.wutang;
//
//import java.util.Arrays;
//
//public class WuTangMemberProgram {
//
//    private String[] members;
//    private int memberSize;
//
//    private boolean isFull() {
//        return memberSize >= members.length;
//    }
//
//    private boolean isEmpty() {
//        return members == null || members.length == 0 || memberSize == 0;
//    }
//
//    public WuTangMemberProgram() {
//        this.members = new String[2];
//        this.memberSize = 0;
//    }
//
//    /* Helper Methods -- Start */
//
//    private void resize() {
//        String[] newMembers = new String[memberSize * 2];
//        System.arraycopy(members, 0, newMembers, 0, memberSize);
//        members = newMembers;
//    }
//
//    private void shiftArray() {
//        if (isEmpty()) return;
//        if (memberSize == 1) {
//            members[0] = null;
//            return;
//        }
//
//        Arrays.stream(members).
//
//    }
//
//    /* Helper Methods -- End */
//
//    public void addNewMember(String newMember) {
//        if (isFull()) resize();
//        members[++memberSize] = newMember;
//        System.out.println(newMember + " Was Added To Group");
//    }
//
//    public void searchMember(String memberName) {
//        if (isEmpty()) {
//            System.out.println("Member List Is Currently Empty!");
//            return;
//        }
//        for (int i = 0; i < memberSize; i++) {
//            if (members[i].equalsIgnoreCase(memberName)) {
//                System.out.println(memberName + " Is A Member");
//                return;
//            }
//        }
//        System.out.println(memberName + " Could Not Be Found!");
//    }
//
//
//    public void removeMember(String memberName) {
//        if (isEmpty()) {
//            System.out.println("Member List Is Currently Empty!");
//            return;
//        }
//        for (int i = 0; i < memberSize; i++) {
//            if (members[i].equalsIgnoreCase(memberName)) {
//                members[i] = null;
//                shiftArray();
//                System.out.println("Removing " + memberName + " From Wu-Tang Clan");
//                System.out.println("Protect Ya Neck Kid!!");
//                System.out.println();
//                memberSize--;
//                return;
//            }
//        }
//
//        System.out.println(memberName + " Could Not Be Found!");
//    }
//
//}