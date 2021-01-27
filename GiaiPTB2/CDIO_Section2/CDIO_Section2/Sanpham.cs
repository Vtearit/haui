using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

/// <summary>
/// Summary description for Sanpham
/// </summary>
public class Sanpham
{
    public Sanpham()
    {
        //
        // TODO: Add constructor logic here
        //
    }
    public string tensp   { get; set; }
    public int soluong{ get; set; }

    public override bool Equals(object obj)
    {
        Sanpham s = (Sanpham)obj;
        return tensp == s.tensp;
    }
}