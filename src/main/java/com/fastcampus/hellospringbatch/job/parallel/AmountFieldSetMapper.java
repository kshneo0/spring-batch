package com.fastcampus.hellospringbatch.job.parallel;

import com.fastcampus.hellospringbatch.dto.AmountDto;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

/**
 * fileName : AmountFieldSetMapper
 * author :  KimSangHoon
 * date : 2022/11/20
 */
public class AmountFieldSetMapper implements FieldSetMapper<AmountDto> {
    @Override
    public AmountDto mapFieldSet(FieldSet fieldSet) throws BindException {
        AmountDto amount = new AmountDto();
        amount.setIndex(fieldSet.readInt(0));
        amount.setName(fieldSet.readString(1));
        amount.setAmount(fieldSet.readInt(2));
        return amount;
    }
}
