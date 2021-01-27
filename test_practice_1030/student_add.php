<?php include("connect.php"); ?>
<html>
    <head>
        <title>Add Student</title>
    </head>

    <body>
        <form method="POST">
            <table width="500px" align="center" border="1">
                <tr>
                    <th colspan="2" align="center"><h3>Add Student</h3></th>
                </tr>
                
                <tr>
                    <th>ID</th>
                    <td>
                        <input type="text" name="txtID" />
                    </td>
                </tr>

                <tr>
                    <th>Name</th>
                    <td>
                        <input type="text" name="txtName" />
                    </td>
                </tr>

                <tr>
                    <th>ID Class</th>
                    <td>
                        <input type="radio" name="txtID_Class" id="txtID_Class1" value="1" /> class 1
                        <input type="radio" name="txtID_Class" id="txtID_Class2" value="2" /> class 2
                        
                    </td>
                </tr>

                <tr>
                    <th>Major</th>
                    <td>
                        <input type="text" name="txtMajor" />
                    </td>
                </tr>

                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Insert" name="btnAdd" /> &nbsp; &nbsp; &nbsp;
                        <input type="submit" value="Cancel" name="btnCancel" />
                    </td>
                </tr>
            </table>
        </form>

        <?php
            
            if(isset($_POST['btnAdd'])){
                $id = $_POST['txtID'];
                $name = $_POST['txtName'];
                $id_class = $_POST['txtID_Class'];
                $major = $_POST['txtMajor'];
                $query = mysqli_query($conn, "Insert into sinhvien values ('$id', '$name', '$id_class', '$major')");
                if($query == true){
                    echo "<script language:'javascript'>alert('Record insert successfully');";
                    echo "location.href='student_list.php';</script>;";
                    // echo "success";
                }
                else {
                    echo "<script language:'javascript'>alert('Error inserting record');";
                    echo "location.href='student_add.php';</script>";
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