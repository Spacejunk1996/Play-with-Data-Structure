package com.company.unionfind;

/**
 * @description: UnionFind1实现类
 * @author: jiangzixu
 * @date: 2021/7/4 6:16 下午
 */
public class UnionFind1 implements UnionFind {

    private int[] id;

    public UnionFind1(int size) {
        id = new int[size];

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isConnected(int p, int q) {
        return false;
    }

    @Override
    public void unionElements(int p, int q) {

    }
}
