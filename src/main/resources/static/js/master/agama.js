$(document).ready(function () {
    grid();
});

function removed(value) {
    console.log(value + " selected!");
}

function grid() {
    $('#listAgama').show();
    if (typeof myTable == 'undefined') {
        myTable = $('#listAgama').dataTable({
            "bPaginate": true,
            "pagingType": "full_numbers",
            "bJQueryUI": false,
            "bProcessing": true,
            "bServerSide": true,
            "bInfo": true,
            "bFilter": false,
            "sAjaxSource": "/private/api/agama/list",
            "aaSorting": [[1, "asc"]],
            "fnServerParams": function (aoData) {
                aoData.push(
                    {name: "nama", value: null}
                );
            },
            "fnServerData": function (sSource, aoData, fnCallback) {
                $.ajax({
                    "dataType": 'json',
                    "type": "GET",
                    "url": sSource,
                    "data": aoData,
                    "success": fnCallback
                });
            },
            "aoColumns": [
                {"mDataProp": "id", "bSortable": false, sClass: "text-center"},
                {"mDataProp": "nama", "bSortable": true, sDefaultContent: "-"},
                {"mDataProp": "id", "bSortable": false, sClass: "text-right"}
            ], "fnRowCallback": function (nRow, aData, iDisplayIndex, iDisplayIndexFull, oSettings) {
                var info = this.api().page.info();
                var page = info.page;
                var length = info.length;
                var index = (page * length + (iDisplayIndex + 1));
                var id = "'" + aData['id'] + "'";
                $('td:eq(0)', nRow).html(index);

                var edit = "<a href='/agama/form/" + aData['id'] + "' class='btn btn-warning'>Ubah</a>";
                var remove = '<button class="btn btn-danger" onclick="removed(' + id + ')">Hapus</button>';
                $('td:eq(2)', nRow).html(edit + " " + remove);
                // $('td:eq(3)', nRow).html(hapus);
                return nRow;
            }
        });
    } else {
        myTable.fnClearTable(0);
        myTable.fnDraw();
    }

}