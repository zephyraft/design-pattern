package com.zephyraft.dp._3behavior._8memento;

import java.util.Stack;

public class SnapshotHolder {

    private final Stack<Snapshot> snapshots = new Stack<>();

    public Snapshot popSnapshot() {
        return snapshots.pop();
    }

    public void pushSnapshot(Snapshot snapshot) {
        snapshots.push(snapshot);
    }
}
