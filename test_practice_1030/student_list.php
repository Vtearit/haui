<!DOCTYPE html>
<html>
<head>
	<title>Student List</title>
</head>
<body>
    <form method="POST">
        <table border="1" bordercolor="red" width="500px" align="center">
            <tr>
                <td colspan="6" align="center"><h2>Student List</h2></td>
            </tr>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>ID Class</th>
                <th>Major</th>
                <th colspan="2">Action</th>
            </tr>
            
            <?php
                include("connect.php");
                $sql = "select * from sinhvien";
                $query = mysqli_query($conn, $sql);
                while($row = mysqli_fetch_assoc($query)){
                    ?>
                    <tr>
                        <td><?php echo $row['ID']; ?></td>
                        <td><?php echo $row['Name']; ?></td>
                        <td><?php echo $row['ID_Class']; ?></td>
                        <td><?php echo $row['Major']; ?></td>
                        <td><a href="student_edit.php?id=<?php echo $row['ID']; ?>">Edit</a></td>
                        <td><a href="student_delete.php?id=<?php echo $row['ID']; ?>">Delete</a></td>
                    </tr>
                    <?php
                }
                ?>
                 <tr>
                    <td height="40px" colspan="6" align="center" ><input type="submit" value="Insert Student" name="btnInsert" /></td>
                </tr>
        </table>

    </form>

        <?php
            if(isset($_POST['btnInsert'])){
                header("location: student_add.php");
            }
            mysqli_close($conn);
        ?>
</body>
</html>