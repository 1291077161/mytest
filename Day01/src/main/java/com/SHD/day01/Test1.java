package com.SHD.day01;

import com.SHD.day02.SheetHeader;

import java.math.BigDecimal;
import java.util.*;

public class Test1 extends MesEntity{

    String aa;
    int bb;

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }

    public int getBb(int bb) {
        return this.bb;
    }

    public void setBb(int bb) {
        this.bb = bb;
    }

    public static void main(String[] args) {

        //Test1 test1 = new Test1();
        //String s = "aaaa";
        //String b = "aaaaa";
        //String intern = b.intern();
        //String intern1 = s.intern();
        //
        ////String test = test(s);
        ////System.out.println("test = " + test);
        ////
        ////System.out.println("s = " + s);

        List<BigDecimal> records = new ArrayList<BigDecimal>();
        records.add(new BigDecimal(9));
        records.add(new BigDecimal(5));
        records.add(new BigDecimal(01));
        System.out.println("records = " + records);
        BigDecimal recoverAmount = new BigDecimal(0);
        for (BigDecimal record : records) {
            recoverAmount =record.add(recoverAmount);
        }
        System.out.println("recoverAmount = " + recoverAmount);


        Set<Integer> set = new HashSet<Integer>();
        //Arrays.asList(2,3,4,5,6,7,8);
        set.addAll(Arrays.asList(1));
        System.out.println("set = " + set);
        List<Integer> integers = Arrays.asList(1, 2, 3);
        //CollectionUtil
        //boolean b2 = CollectionUtil.containsAny(Arrays.asList(2, 3, 4, 5, 6, 7, 8), set);
        //set.addAll(Arrays.asList(2,3,4,5,6,7,8));

        //System.out.println("b2 = " + b2);
        //System.out.println("set = " + set);

        //GenerationTypeEnum



    }

    public static void test (StringBuilder sb) {
        sb.append("aaa");
    }
    public static String test (String sb) {
        String s = sb + "cc";
        return s;
    }
}

class MesEntity {

    private String extFields;

    private Long siteId;

    public void setExtFields(String extFields) {
        //this.extFields = Func.isEmpty(extFields) ? null : extFields;
        this.extFields = extFields;
    }

    public MesEntity() {
    }

    public String getExtFields() {
        return this.extFields;
    }

    public Long getSiteId() {
        return this.siteId;
    }

    public void setSiteId(final Long siteId) {
        this.siteId = siteId;
    }

    @Override
    public String toString() {
        return "MesEntity(extFields=" + this.getExtFields() + ", siteId=" + this.getSiteId() + ")";
    }

    //@Override
    //public boolean equals(final Object o) {
    //    if (o == this) {
    //        return true;
    //    } else if (!(o instanceof MesEntity)) {
    //        return false;
    //    } else {
    //        MesEntity other = (MesEntity)o;
    //        if (!other.canEqual(this)) {
    //            return false;
    //        } else if (!super.equals(o)) {
    //            return false;
    //        } else {
    //            Object this$siteId = this.getSiteId();
    //            Object other$siteId = other.getSiteId();
    //            if (this$siteId == null) {
    //                if (other$siteId != null) {
    //                    return false;
    //                }
    //            } else if (!this$siteId.equals(other$siteId)) {
    //                return false;
    //            }
    //
    //            Object this$extFields = this.getExtFields();
    //            Object other$extFields = other.getExtFields();
    //            if (this$extFields == null) {
    //                if (other$extFields != null) {
    //                    return false;
    //                }
    //            } else if (!this$extFields.equals(other$extFields)) {
    //                return false;
    //            }
    //
    //            return true;
    //        }
    //    }
    //}

    //protected boolean canEqual(final Object other) {
    //    return other instanceof MesEntity;
    //}


    //@Override
    //public int hashCode() {
    //    int PRIME = true;
    //    int result = super.hashCode();
    //    Object $siteId = this.getSiteId();
    //    result = result * 59 + ($siteId == null ? 43 : $siteId.hashCode());
    //    Object $extFields = this.getExtFields();
    //    result = result * 59 + ($extFields == null ? 43 : $extFields.hashCode());
    //    return result;
    //}
}
