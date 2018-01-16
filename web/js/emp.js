function  deleteEmp(id) {

    $.post("deleteemp.do",{"employeeId":id},function (data) {
        var  t = eval('('+data+')');
        alert(t.msg);
        window.location.href = "emp.do";
    });


}

function  updateemp(id) {

    var temp = $('#formdept').serialize();

    $.post("updatedept.do",temp,function (data) {

        var  t = eval('('+data+')');
        alert(t.msg);
        window.location.href = "dept.do";

    });

}



function addemployee() {

    var temp = $('#empform').serialize();

    $.post("empadd.do",temp,function (data) {
        var  t = eval('('+data+')');
        alert(t.msg);


    });

    function  photo(id){

        window.location.href = "showdeptbyid.do?employeeId="+id;

    }

}