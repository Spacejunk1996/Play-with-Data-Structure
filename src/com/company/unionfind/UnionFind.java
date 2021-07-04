package com.company.unionfind;

/**
 * @description: UnionFind实现接口
 * @author: jiangzixu
 * @date: 2021/7/4 12:15 下午
 */
public interface UnionFind {

    int getSize();

    boolean isConnected(int p, int q);

    void unionElements(int p, int q);
}
