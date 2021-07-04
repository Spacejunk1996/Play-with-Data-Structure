package com.company.unionfind;

/**
 * @description: 第二版UnionFind Quick Union
 * @author: jiangzixu
 * @date: 2021/7/4 6:29 下午
 */
public class UnionFind2 implements UnionFind {

    private int[] parent;

    public UnionFind2(int size) {
        parent = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i;
        }
    }

    @Override
    public int getSize() {
        return parent.length;
    }

    private int find(int p) {
        if (p < 0 || p > parent.length) {
            throw new IllegalArgumentException("p is out of bound");
        }

        while (p != parent[p]) {
            p = parent[p];
        }
        return p;
    }

    @Override
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public void unionElements(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);

        if (pRoot == qRoot) {
            return;
        }
        parent[pRoot] = qRoot;
    }
}
