using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsForms18118087
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            button1.Enabled = false;
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {

        }

        private void label6_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {


        }

        private void button4_Click(object sender, EventArgs e)
        {
            DialogResult res = MessageBox.Show("Изход от приложението", "", MessageBoxButtons.YesNo);
            if (res == DialogResult.Yes)
            {
                this.Close();
            }


        }

        private void button2_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Изчисляване на отстъпка и обща стойност за текущо въведена продажба");
            double discount, price, quantity, value;


            price = Double.Parse(txtPrice.Text);
            quantity = Double.Parse(txtQuantity.Text);
            value = price * quantity;
            if (value > 100)
            {
                discount = (price * quantity) * 10 / 100;
                txtDiscount.Text = discount.ToString();
                value = (price * quantity) - discount;
                txtValue.Text = value.ToString();
            }
            else
            {
                discount = 0;
                txtDiscount.Text = discount.ToString();
                txtValue.Text = (price * quantity).ToString();
            }
            button2.Enabled = false;
            button1.Enabled = true;

            if(discount > 0)
            {
                txtDiscount.BackColor = Color.Red;
               
            }
            else
            {
                txtDiscount.BackColor = Color.Black;
            }

        }
    }
}
