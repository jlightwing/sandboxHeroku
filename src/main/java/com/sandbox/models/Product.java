package com.sandbox.models;

public class Product
{
  private String code;
  private String desc;

  public Product()
  {
  }

  public Product(String code, String desc)
  {

    this.code = code;
    this.desc = desc;
  }

  public String getCode()
  {
    return code;
  }

  public String getDesc()
  {
    return desc;
  }

  @Override
  public String toString()
  {
    return "Product{" +
            "code='" + code + '\'' +
            ", desc='" + desc + '\'' +
            '}';
  }
}
