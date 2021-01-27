<html>
    <head>
        <title>Delete Student</title>
    </head>
    
    <body>
        <?php
            include("connect.php");
            $id = $_GET['id'];
            $qr = mysqli_query($conn, "delete from sinhvien where ID = '$id'");
            if($qr==true){
                echo "<script language='javascript'>alert('Delete record successfully');";
                echo "location.href='student_list.php';</script>";
            }
            else {
                echo "<script language='javascript'>alert('Error deleting record');";
                echo "location.href='student_list.php';</script>";
            }
            mysqli_close($conn);
        ?>
    </body>
</html>