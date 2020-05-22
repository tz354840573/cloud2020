package com.cloud.payment.mapper;

import com.cloud.api.entities.Payment;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;


@Mapper
public interface PaymentMapper {

    @Insert("insert into payment(serial) values(#{payment.serial})")
    @Options(useGeneratedKeys = true, keyProperty = "payment.id", keyColumn = "id")
    int save(@Param("payment") Payment payment);

    @Select("select id,serial from payment where id = #{id}")
    Optional<Payment> getPaymentById(@Param("id") Long id);


    @Select("select id,serial from payment")
    List<Payment> getPaymentList();

}
