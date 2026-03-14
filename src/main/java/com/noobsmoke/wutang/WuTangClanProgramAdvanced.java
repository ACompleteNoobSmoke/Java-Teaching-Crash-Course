package com.noobsmoke.wutang;

import java.util.Arrays;

public class WuTangClanProgramAdvanced {
    private String[] members;
    private int memberSize;

    private boolean isFull() {
        return memberSize == members.length;
    }

    private boolean isEmpty() {
        return memberSize == 0;
    }

    public WuTangClanProgramAdvanced() {
        this.members = new String[2];
        this.memberSize = 0;
    }

    /* Helper Methods -- Start */

    private void resize() {
        if (isEmpty()) return;
        members = Arrays.copyOf(members, members.length * 2);
    }

    private boolean isMemberNameEmpty(String memberName) {
        return memberName == null || memberName.isBlank();
    }

    /* Helper Methods -- End */

    public void addMember(String newMember) {
        if (isMemberNameEmpty(newMember))
            throw new IllegalArgumentException("Please enter a valid member name");
        if (hasMember(newMember))
            throw new IllegalStateException(newMember + " already exists in clan");
        if (isFull()) resize();
        members[memberSize++] = newMember;
    }

    public boolean hasMember(String memberName) {
        if (isMemberNameEmpty(memberName))
            throw new IllegalArgumentException("Please enter a valid member name");

      return Arrays.stream(members, 0, memberSize)
                .anyMatch(currentMember -> currentMember.equalsIgnoreCase(memberName));
    }


    public boolean removeMember(String memberName) {
        if (isMemberNameEmpty(memberName)) {
            throw new IllegalArgumentException("Please enter a valid member name");
        }

        for (int i = 0; i < memberSize; i++) {
            if (members[i].equalsIgnoreCase(memberName)) {
                System.arraycopy(members, i + 1, members, i, memberSize - i - 1);
                members[--memberSize] = null;
                return true;
            }
        }

        return false;
    }


}
