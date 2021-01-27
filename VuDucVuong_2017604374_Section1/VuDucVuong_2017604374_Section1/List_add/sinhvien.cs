using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace VuDucVuong_2017604374_Section1
{

    /// <summary>
    /// Summary description for Sinhvien
    /// </summary>

public class sinhvien
    {
        public int masv { get; set; }

        public string hoten { get; set; }

        public string diachi { get; set; }

        public string dienthoai { get; set; }

        public int malop { get; set; }

        public sinhvien()
        {
           
        }

        public sinhvien( string hoten, string diachi, string dienthoai, int malop)
        {
            this.hoten = hoten;
            this.diachi = diachi;
            this.dienthoai = dienthoai;
            this.malop = malop;
        }
    }
}