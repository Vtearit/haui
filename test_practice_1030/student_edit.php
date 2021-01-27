<html>
    <head>
        <title>Edit Student</title>
    </head>

    <body>
        <?php
           include("connect.php");
            $id = $_GET['id'];
            $query = mysqli_query($conn, "select * from sinhvien where ID = '$id'");
            $row=mysqli_fetch_assoc($query);
        ?>
        <form method="POST">
            <table width="500px" border="1" align="center">
                <tr>
                    <th colspan="2"><h3>Edit Student</h3></th>
                </tr>
                <tr>
                    <th>ID</th>
                    <td>
                        <input type="text" disabled value="<?php echo $id; ?>" />
                    </td>
                </tr>

                <tr>
                    <th>Name</th>
                    <td>
                        <input type="text" value="<?php echo $row['Name'];  ?>" name="txtName" />
                    </td>
                </tr>

                <tr>
                    <th>ID Class</th>
                    <td>
                        <!-- <input type="text" value="<?php echo $row['ID_Class'];  ?>" name="txtID_Class" /> -->
                        <input type="radio" name="txtID_Class" id="id_class1" value="1" <?php if($row['ID_Class']==1) echo "checked"; ?> />1
                        <input type="radio" name="txtID_Class" id="id_class2" value="2" <?php if($row['ID_Class']==2) echo "checked"; ?> />2
                    </td>
                </tr>

                <tr>
                    <th>Major</th>
                    <td>
                        <input type="text" value="<?php echo $row['Major'];  ?>" name="txtMajor" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center" height="50px" >
                        <input type="submit" value="Update" name="btnUpdate" /> &nbsp; &nbsp; &nbsp;
                        <input type="submit" value="Cancel" name="btnCancel" />
                    </td>

                </tr>
            </table>
            </form>

        <?php
            if(isset($_POST['btnUpdate'])){
                $id = $_GET['id'];
                $name = $_POST['txtName'];
                $id_class = $_POST['txtID_Class'];
                $major = $_POST['txtMajor'];

                // create connection and execute sql query
                $sql1 = "Update sinhvien set Name = '$name', ID_Class = '$id_class', Major = '$major' where ID = '$id'";
                $qr = mysqli_query($conn, $sql1);
                if($qr == true){
                    echo "<script language='javascript'>alert('Record update successfully');";
                    echo "location.href='student_list.php';</script>";
                } else {
                    echo "<script language='javascript'>alert('Error updating record');";
                    // echo "fail";
                }
            }
            if(isset($_POST['btnCancel'])){
                header("location: student_list.php");
            }
            mysqli_close($conn);
        ?>
    </body>
</html>