using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace Final_Test_Practice
{
    public class DataUtil
    {
        SqlConnection conn;
        public DataUtil()
        {
            string sqlCon = @"Data Source=DESKTOP-QCVV79D\SQLEXPRESS01;Initial Catalog=sinhviendb2;Integrated Security=True";
            conn = new SqlConnection(sqlCon);
        }
        public List<Student> dsStudent()
        {
            List<Student> ds = new List<Student>();
            string sql = "select * from sinhvien";
            conn.Open();
            SqlCommand cmd = new SqlCommand(sql, conn);
            SqlDataReader dr = cmd.ExecuteReader();
            while (dr.Read())
            {
                Student s = new Student();
                s.masv = (int)dr["masv"];
                s.hoten = (string)dr["hoten"];
                s.diachi = (string)dr["diachi"];
                s.dienthoai = (string)dr["dienthoai"];
                s.malop = (int)dr["malop"];
                s.anh = (string)dr["anh"];
                ds.Add(s);
            }
            conn.Close();
            return ds;
        }

        public List<Student> dsStudentOnClass(int malop)
        {
            List<Student> ds = new List<Student>();
            conn.Open();
            string sql = "select * from sinhvien where malop = @malop";
            SqlCommand cmd = new SqlCommand(sql, conn);
            cmd.Parameters.AddWithValue("malop", malop);
            Student s = null;
            SqlDataReader rd = cmd.ExecuteReader();
            while (rd.Read())
            {
                s = new Student();
                s.masv = (int)rd["masv"];
                s.hoten = (string)rd["hoten"];
                s.diachi = (string)rd["diachi"];
                s.dienthoai = (string)rd["dienthoai"];
                s.malop = (int)rd["malop"];
                s.anh = (string)rd["anh"];
                ds.Add(s);
            }
            conn.Close();
            return ds;
        }

        public Student selectOneStudent(int masv)
        {
            List<Student> ds = new List<Student>();
            string sql = "select* from sinhvien where masv = @masv";
            conn.Open();
            SqlCommand cmd = new SqlCommand(sql, conn);
            cmd.Parameters.AddWithValue("masv", masv);
            Student s = null;
            SqlDataReader rd = cmd.ExecuteReader();
            while (rd.Read())
            {
                s = new Student();
                s.masv = (int)rd["masv"];
                s.hoten = (string)rd["hoten"];
                s.diachi = (string)rd["diachi"];
                s.dienthoai = (string)rd["dienthoai"];
                s.malop = (int)rd["malop"];
                s.anh = (string)rd["anh"];
            }
            conn.Close();
            return s;
        }

        public List<Class> dsClass()
        {
            List<Class> ds = new List<Class>();
            string sql = "select * from lophoc";
            conn.Open();
            SqlCommand cmd = new SqlCommand(sql, conn);
            SqlDataReader dr = cmd.ExecuteReader();
            while (dr.Read())
            {
                Class lh = new Class();
                lh.malop = (int)dr["malop"];
                lh.tenlop = (string)dr["tenlop"];
                ds.Add(lh);
            }
            conn.Close();
            return ds;
        }
        public void addStudent(Student s)
        {
            conn.Open();
            string sql = "Insert into sinhvien values (@ht, @dc, @dt, @malop, @anh)";
            SqlCommand cmd = new SqlCommand(sql, conn);
            cmd.Parameters.AddWithValue("ht", s.hoten);
            cmd.Parameters.AddWithValue("dc", s.diachi);
            cmd.Parameters.AddWithValue("dt", s.dienthoai);
            cmd.Parameters.AddWithValue("malop", s.malop);
            cmd.Parameters.AddWithValue("anh", s.anh);
            cmd.ExecuteNonQuery();
            conn.Close();
        }
        public void deleteStudent(int masv)
        {
            conn.Open();
            string sql = "Delete from sinhvien where masv = @masv";
            SqlCommand cmd = new SqlCommand(sql, conn);
            cmd.Parameters.AddWithValue("masv", masv);
            cmd.ExecuteNonQuery();
            conn.Close();
        }

        public void updateStudent(Student s)
        {
            conn.Open();
            string sql = "Update sinhvien set hoten = @ht, diachi = @dc, dienthoai = @dt, malop = @malop where masv = @masv";
            SqlCommand cmd = new SqlCommand(sql, conn);
            cmd.Parameters.AddWithValue("ht", s.hoten);
            cmd.Parameters.AddWithValue("dc", s.diachi);
            cmd.Parameters.AddWithValue("dt", s.dienthoai);
            cmd.Parameters.AddWithValue("malop", s.malop);
            cmd.Parameters.AddWithValue("masv", s.masv);
            cmd.ExecuteNonQuery();
            conn.Close();
        }
    }
}