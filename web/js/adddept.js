function adept() {

    var temp = $('#formdept').serialize();

    $.post("adddept.do",temp,function (data) {
        var  t = eval('('+data+')');
        alert(t.msg);
        window.location.href = "/hr/dept.do";

    });

}


function deletedept(id) {

    $.post("deletedept.do",{"departmentId":id},function (data) {
        var  t = eval('('+data+')');
        alert(t.msg);
        window.location.href = "dept.do";
    });

}

function updatedept(id) {


   window.location.href = "showdeptbyid.do?departmentId="+id;

}

function updateDept() {

    var temp = $('#formdept').serialize();

    $.post("updatedept.do",temp,function (data) {

        var  t = eval('('+data+')');
        alert(t.msg);
        window.location.href = "dept.do";

    });

}