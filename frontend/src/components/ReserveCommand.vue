<template>
    <v-card outlined>
        <v-card-title>
            Reserve
        </v-card-title>

        <v-card-text>
            <Number label="UserId" v-model="value.userId" :editMode="editMode"/>
            <String label="MsgTitle" v-model="value.msgTitle" :editMode="editMode"/>
            <String label="MsgContent" v-model="value.msgContent" :editMode="editMode"/>
            <Number label="ReserveQt" v-model="value.reserveQt" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="reserve"
            >
                Reserve
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'ReserveCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.userId = 0;
            this.value.msgTitle = '';
            this.value.msgContent = '';
            this.value.reserveQt = 0;
        },
        watch: {
        },
        methods: {
            reserve() {
                this.$emit('reserve', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

