function get_auto_count_ajax() {
    $.ajax({
        url: '/admin/auto-count',
        success: function (data) {

            $('#pending').html(data.pending);
            $('#approved').html(data.approved);
            $('#istifadeciler').html(data.istifadeciler);
            $('#active-user-count').html(data.istifadeciler);
        }

    });
}