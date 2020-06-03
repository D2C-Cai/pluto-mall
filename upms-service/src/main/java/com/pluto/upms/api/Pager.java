package com.pluto.upms.api;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.pluto.upms.query.base.BaseQuery;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页封装类
 *
 * @param <T>
 */
@Data
public final class Pager<T> implements IPage<T> {

    private static final String SPILT_ORDERS = ",";
    private static final String SPILT_ITEMS = ":";

    /**
     * 数据总量
     */
    private long total;
    /**
     * 当前页长
     */
    private long size;
    /**
     * 当前页码
     */
    private long current;
    /**
     * 列表数据
     */
    private List<T> records;
    /**
     * 排序字段 xxx:asc,xxx:desc
     */
    private String orders;

    public Pager() {
    }

    public <Q extends BaseQuery> Pager(Q query) {
        this.current = query.getCurrent();
        this.size = query.getSize();
        this.orders = query.getOrders();
    }

    @Override
    public List<OrderItem> orders() {
        // 自动处理分页排序参数 形如 {"orders":"xxx:asc,xxx:desc"}
        List<OrderItem> orderItems = new ArrayList<>();
        if (orders != null) {
            String[] array = orders.split(SPILT_ORDERS);
            for (String order : array) {
                String[] items = order.split(SPILT_ITEMS);
                if ("ASC".equalsIgnoreCase(items[1])) {
                    orderItems.add(OrderItem.asc(items[0]));
                }
                if ("DESC".equalsIgnoreCase(items[1])) {
                    orderItems.add(OrderItem.desc(items[0]));
                }
            }
        }
        return orderItems;
    }

    @Override
    public List<T> getRecords() {
        return this.records;
    }

    @Override
    public IPage<T> setRecords(List<T> records) {
        this.records = records;
        return this;
    }

    @Override
    public long getTotal() {
        return this.total;
    }

    @Override
    public IPage<T> setTotal(long total) {
        this.total = total;
        return this;
    }

    @Override
    public long getSize() {
        return this.size;
    }

    @Override
    public IPage<T> setSize(long size) {
        this.size = size;
        return this;
    }

    @Override
    public long getCurrent() {
        return this.current;
    }

    @Override
    public IPage<T> setCurrent(long current) {
        this.current = current;
        return this;
    }

}
