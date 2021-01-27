using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace Intern_Practice
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        SqlConnection sqlCon = new SqlConnection("Data Source=DESKTOP-QCVV79D\\SQLEXPRESS01;Initial Catalog=test;Integrated Security=True");

        SqlCommandBuilder sqlCommand = null;

        SqlDataAdapter sqlAdapter = null;

        DataSet dataset = null;

        private void Form1_Load(object sender, EventArgs e)
        {
            try
            {
                sqlCon.Open();
                LoadData();
            }
            catch (Exception ex) { MessageBox.Show(ex.Message); }
        }

        private void LoadData()
        {
            try
            {
                sqlAdapter = new SqlDataAdapter("SELECT *, 'Delete' AS [Delete] FROM tbl_students", sqlCon);
                sqlCommand = new SqlCommandBuilder(sqlAdapter);
                sqlAdapter.InsertCommand = sqlCommand.GetInsertCommand();
                sqlAdapter.UpdateCommand = sqlCommand.GetUpdateCommand();
                sqlAdapter.DeleteCommand = sqlCommand.GetDeleteCommand();
                dataset = new DataSet();
                sqlAdapter.Fill(dataset, "tbl_students");
                dataGridView1.DataSource = null;
                dataGridView1.DataSource = dataset.Tables["tbl_students"];
                for (int i = 0; i < dataGridView1.Rows.Count; i++)
                {
                    DataGridViewLinkCell linkCell = new DataGridViewLinkCell();
                    dataGridView1[5, i] = linkCell;
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void dgv_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            try
            {
                if (e.ColumnIndex == 5)
                {
                    string Task = dataGridView1.Rows[e.RowIndex].Cells[5].Value.ToString();
                    if (Task == "Delete")
                    {
                        if (MessageBox.Show("Bạn có chắc chắm muốn xóa không?", "Đang xóa...", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
                        {
                            int rowIndex = e.RowIndex;
                            dataGridView1.Rows.RemoveAt(rowIndex);
                            dataset.Tables["tbl_students"].Rows[rowIndex].Delete();
                            sqlAdapter.Update(dataset, "tbl_students");
                        }
                    }
                    else if (Task == "Insert")
                    {
                        int row = dataGridView1.Rows.Count - 2;
                        DataRow dr = dataset.Tables["tbl_students"].NewRow();
                        dr["id"] = dataGridView1.Rows[row].Cells["id"].Value;
                        dr["name"] = dataGridView1.Rows[row].Cells["name"].Value;
                        dr["address"] = dataGridView1.Rows[row].Cells["address"].Value;
                        dr["phone"] = dataGridView1.Rows[row].Cells["phone"].Value;
                        dr["email"] = dataGridView1.Rows[row].Cells["email"].Value;
                        dataset.Tables["tbl_students"].Rows.Add(dr);
                        dataset.Tables["tbl_students"].Rows.RemoveAt(dataset.Tables["tbl_students"].Rows.Count - 1);
                        dataGridView1.Rows.RemoveAt(dataGridView1.Rows.Count - 2);
                        dataGridView1.Rows[e.RowIndex].Cells[5].Value = "Delete";
                        sqlAdapter.Update(dataset, "tbl_students");
                    }
                    else if (Task == "Update")
                    {
                        int r = e.RowIndex;
                        dataset.Tables["tbl_students"].Rows[r]["id"] = dataGridView1.Rows[r].Cells["id"].Value;
                        dataset.Tables["tbl_students"].Rows[r]["name"] = dataGridView1.Rows[r].Cells["name"].Value;
                        dataset.Tables["tbl_students"].Rows[r]["address"] = dataGridView1.Rows[r].Cells["address"].Value;
                        dataset.Tables["tbl_students"].Rows[r]["phone"] = dataGridView1.Rows[r].Cells["phone"].Value;
                        dataset.Tables["tbl_students"].Rows[r]["email"] = dataGridView1.Rows[r].Cells["email"].Value;
                        sqlAdapter.Update(dataset, "tbl_students");
                        dataGridView1.Rows[e.RowIndex].Cells[5].Value = "Delete";
                    }
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void dataGridView1_UserAddedRow(object sender, DataGridViewRowEventArgs e)
        {
            try
            {
                int lastRow = dataGridView1.Rows.Count - 2;
                DataGridViewRow nRow = dataGridView1.Rows[lastRow];
                DataGridViewLinkCell linkCell = new DataGridViewLinkCell();
                dataGridView1[5, lastRow] = linkCell;
                nRow.Cells["Delete"].Value = "Insert";
            }
            catch (Exception ex) { MessageBox.Show(ex.Message); }
        }

        private void dataGridView1_CellContentDoubleClick(object sender, DataGridViewCellEventArgs e)
        {
            try
            {
                int lastRow = e.RowIndex;
                DataGridViewRow nRow = dataGridView1.Rows[lastRow];
                DataGridViewLinkCell linkCell = new DataGridViewLinkCell();
                dataGridView1[5, lastRow] = linkCell;
                nRow.Cells["Delete"].Value = "Update";
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
