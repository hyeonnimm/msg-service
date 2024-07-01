
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ReservationMsgReqManager from "./components/listers/ReservationMsgReqCards"
import ReservationMsgReqDetail from "./components/listers/ReservationMsgReqDetail"

import SendMsgManager from "./components/listers/SendMsgCards"
import SendMsgDetail from "./components/listers/SendMsgDetail"

import StatStatManager from "./components/listers/StatStatCards"
import StatStatDetail from "./components/listers/StatStatDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/reservations/msgReqs',
                name: 'ReservationMsgReqManager',
                component: ReservationMsgReqManager
            },
            {
                path: '/reservations/msgReqs/:id',
                name: 'ReservationMsgReqDetail',
                component: ReservationMsgReqDetail
            },

            {
                path: '/sends/msgs',
                name: 'SendMsgManager',
                component: SendMsgManager
            },
            {
                path: '/sends/msgs/:id',
                name: 'SendMsgDetail',
                component: SendMsgDetail
            },

            {
                path: '/stats/stats',
                name: 'StatStatManager',
                component: StatStatManager
            },
            {
                path: '/stats/stats/:id',
                name: 'StatStatDetail',
                component: StatStatDetail
            },




    ]
})
