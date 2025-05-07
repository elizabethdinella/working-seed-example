package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.jscomp.Compiler;

public class Seed {

    @Test
    public void testBugTrigger() {
        Node node0 = new Node(1999);
        boolean boolean0 = NodeUtil.mayBeStringHelper(node0);

        assertTrue(boolean0);
    }
}
