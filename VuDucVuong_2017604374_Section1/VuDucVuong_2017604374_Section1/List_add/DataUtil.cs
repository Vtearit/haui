using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Data.SqlClient;
using System.Data.Sql;

namespace VuDucVuong_2017604374_Section1.List_add
{
    /// <summary>
    /// Sumary description for DataUtil
    /// </summary>
    public class DataUtil
    {
        SqlConnection con;
        public DataUtil()
        {
            string sqlCon = "Data Source=DESKTOP-QCVV79D\\SQLEXPRESS01;Initial Catalog=sinhviendb2;Integrated Security=True";
            con = new SqlConnection(sqlCon);
        }
        public List<sinhvien> dsSinhvien()
        {
            List<sinhvien> ds = new List<sinhvien>();
            string sql = "select * from sinhvien";
            con.Open();
            SqlCommand cmd = new SqlCommand(sql, con);
            SqlDataReader rd = cmd.ExecuteReader();
            while (rd.Read())
            {
                sinhvien s = new sinhvien();
                s.masv = (int)rd["masv"];
                s.hoten = (string)rd["hoten"];
                s.diachi = (string)rd["diachi"];
                s.dienthoai = (string)rd["dienthoai"];
                s.malop = (int)rd["malop"];
                ds.Add(s);
            }
            con.Close();
            return ds;
        }

        public List<lophoc> dsLophoc()
        {
            List<lophoc> ds = new List<lophoc>();
            string sql = "select * from lophoc";
            con.Open();
            SqlCommand cmd = new SqlCommand(sql, con);
            SqlDataReader rd = cmd.ExecuteReader();
            while (rd.Read())
            {
                lophoc l = new lophoc();
                l.malop = (int)rd["malop"];
                l.tenlop = (string)rd["tenlop"];
                ds.Add(l);
            }
            con.Close();
            return ds;
        }

        public void addStudent(sinhvien s)
        {
            con.Open();
            string sql = "insert into sinhvien values (@ht, @dc, @dt, @malop)";
            SqlCommand cmd = new SqlCommand(sql, con);
            cmd.Parameters.AddWithValue("ht", s.hoten);
            cmd.Parameters.AddWithValue("dc", s.diachi);
            cmd.Parameters.AddWithValue("dt", s.dienthoai);
            cmd.Parameters.AddWithValue("malop", s.malop);
            cmd.ExecuteNonQuery();
            con.Close();
        }

        public void XoaSv(int masv)
        {
            con.Open();
            String strSql = "Delete from sinhvien where masv = @masv";
            SqlCommand cmd = new SqlCommand(strSql, con);
            cmd.Parameters.AddWithValue("masv", masv);
            cmd.ExecuteNonQuery();
            con.Close();
        }

        public sinhvien selectOneSv(int masv)
        {
            List<sinhvien> ds = new List<sinhvien>();
            string sql = "select * from sinhvien where masv = @masv";
            con.Open();
            SqlCommand cmd = new SqlCommand(sql, con);
            cmd.Parameters.AddWithValue("masv", masv);

            sinhvien s = null;

            SqlDataReader rd = cmd.ExecuteReader();
            if (rd.Read())
            {
                s = new sinhvien();
                s.masv = (int)rd["masv"];
                s.hoten = (string)rd["hoten"];
                s.diachi = (string)rd["diachi"];
                s.dienthoai = (string)rd["dienthoai"];
                s.malop = (int)rd["malop"];
            }
            con.Close();
            return s;
        }

        public void UpdateSv(sinhvien s)
        {
            con.Open();
            string sql = "Update sinhvien set hoten = @ht, diachi = @dc, dienthoai = @dt, malop = @malop where  masv = @masv";
            SqlCommand cmd = new SqlCommand(sql, con);
            cmd.Parameters.AddWithValue("ht", s.hoten);
            cmd.Parameters.AddWithValue("dc", s.diachi);
            cmd.Parameters.AddWithValue("dt", s.dienthoai);
            cmd.Parameters.AddWithValue("malop", s.malop);
            cmd.Parameters.AddWithValue("masv", s.masv);
            cmd.ExecuteNonQuery();
            con.Close(); 
        }
    }
}